package com.SMS.base;

import org.supercsv.cellprocessor.*;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.*;
import org.supercsv.prefs.CsvPreference;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StuSysIO {
    private static CellProcessor[] getStuProcessors() {
        return new CellProcessor[]{
                new ParseInt(), // 学号
                new NotNull(), // 姓名
                new ParseBool("男", "女"), // 性别
                new ParseInt(), // 班别
                new NotNull(), // 专业
                new NotNull(), // 学院
                new ParseLong(), // 电话
                new NotNull(), // 微信ID
                new ParseInt(), //入学年份
                new NotNull() //宿舍
        };
    }

    private static CellProcessor[] putStuProcessors() {
        return new CellProcessor[]{
                new NotNull(), // 学号
                new NotNull(), // 姓名
                new FmtBool("男", "女"), // 性别
                new NotNull(), // 班别
                new NotNull(), // 专业
                new NotNull(), // 学院
                new NotNull(), // 电话
                new NotNull(), // 微信ID
                new NotNull(), //入学年份
                new NotNull() //宿舍
        };
    }

    private static CellProcessor[] getUniMemProcessors() {
        return new CellProcessor[]{
                new NotNull(), //社团名
                new ParseInt(), // 学号
                new ParseDate("yyyy/MM/dd"), // 加入日期
                new NotNull()// 职位
        };
    }

    private static CellProcessor[] putUniMemProcessors() {
        return new CellProcessor[]{
                new NotNull(), //社团名
                new NotNull(), // 学号
                new FmtDate("yyyy/MM/dd"), // 加入日期
                new NotNull()// 职位
        };
    }

    private static CellProcessor[] getUniProcessors() {
        return new CellProcessor[]{
                new NotNull(), //name 社团名
                new NotNull(), // from 从属关系
                new NotNull(), // type 社团类型
        };
    }

    private static CellProcessor[] getCourProcessors() {
        return new CellProcessor[]{
                new ParseInt(), //学生学号
                new NotNull(), // 课程名
                new ParseChar(), // 地点
                new ParseInt(), // 教室
                new ParseInt(), //单双周
                new ParseInt(), // 周几
                new ParseInt() //第几节课
        };
    }

    private static CellProcessor[] putCourProcessors() {
        return new CellProcessor[]{
                new NotNull(),//学生学号
                new NotNull(), // 课程名
                new NotNull(), // 地点
                new NotNull(), // 教室
                new NotNull(), //单双周
                new NotNull(), // 周几
                new NotNull() //第几节课
        };
    }

    private static CellProcessor[] putUniProcessors() {
        return getUniProcessors();
    }

    public static void main(String[] args) throws IOException {
        StuSysIO ssio = new StuSysIO();
        createFile("data/cour.csv");
    }

    public void sysImport(Stu_Database stu_database, String csvFilename) throws IOException {
        try (ICsvBeanReader beanReader = new CsvBeanReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getStuProcessors();
            Student stu;
            while ((stu = beanReader.read(Student.class, header, processors)) != null) {
                stu_database.add_stu(stu.num, stu);
            }
        }
    }

    public static boolean createFile(String destFileName) {
        File file = new File(destFileName);
        if (file.exists()) {
            //System.out.println("创建单个文件" + destFileName + "失败，目标文件已存在！");
            return false;
        }
        if (destFileName.endsWith(File.separator)) {
            System.out.println("创建单个文件" + destFileName + "失败，目标文件不能为目录！");
            return false;
        }
        //判断目标文件所在的目录是否存在
        if (!file.getParentFile().exists()) {
            //如果目标文件所在的目录不存在，则创建父目录
            System.out.println("目标文件所在目录不存在，准备创建它！");
            if (!file.getParentFile().mkdirs()) {
                System.out.println("创建目标文件所在目录失败！");
                return false;
            }
        }
        //创建目标文件
        try {
            if (file.createNewFile()) {
                System.out.println("创建单个文件" + destFileName + "成功！");
                return true;
            } else {
                System.out.println("创建单个文件" + destFileName + "失败！");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("创建单个文件" + destFileName + "失败！" + e.getMessage());
            return false;
        }
    }

    public void sysImport(Schedule sche, String csvFilename) throws IOException {
        try (ICsvBeanReader beanReader = new CsvBeanReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getCourProcessors();
            Course cour;
            while ((cour = beanReader.read(Course.class, header, processors)) != null) {
                sche.add_cour(cour);
            }
        }
    }

    public void sysExport(Schedule sche, String csvFilename) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFilename),
                CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[]{"stu_num", "name", "pos", "clasroom", "week", "day", "time"};
            final CellProcessor[] processors = putCourProcessors();
            // write the header
            beanWriter.writeHeader(header);
            // write the beans
            for (final Course cour : sche.get_all_course()) {
                beanWriter.write(cour, header, processors);
            }
        }
    }

    public void sysExport(Stu_Database stu_database, String csvFilename) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFilename),
                CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[]{"num", "name", "sex", "clas", "prof", "colle", "tel", "wechat", "year", "dorm"};
            final CellProcessor[] processors = putStuProcessors();
            // write the header
            beanWriter.writeHeader(header);
            // write the beans
            for (final Student stu : stu_database.all_stu()) {
                beanWriter.write(stu, header, processors);
            }
        }
    }

    public void sysImport(Uni_Database uni_database, String csvFilename_Uni, String csvFilename_Mem) throws IOException {
        try (ICsvBeanReader beanReader = new CsvBeanReader(new FileReader(csvFilename_Uni), CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getUniProcessors();
            Union uni;
            while ((uni = beanReader.read(Union.class, header, processors)) != null) {
                uni_database.add_uni(uni);
            }
        }
        try (ICsvMapReader mapReader = new CsvMapReader(new FileReader(csvFilename_Mem), CsvPreference.STANDARD_PREFERENCE)) {
            // the header columns are used as the keys to the Map
            final String[] header = mapReader.getHeader(true);
            final CellProcessor[] processors = getUniMemProcessors();
            Map<String, Object> customerMap;
            while ((customerMap = mapReader.read(header, processors)) != null) {
                Union uni = uni_database.get_nui((String) customerMap.get("uni_name"));
                uni.joinMember((Integer) customerMap.get("stu_num"), (Date) customerMap.get("join_date"), (String) customerMap.get("level"));
            }
        }
    }

    public void sysExport(Uni_Database uni_database, String csvFilename_Uni, String csvFilename_Mem) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFilename_Uni),
                CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[]{"uniName", "from", "type"};
            final CellProcessor[] processors = putUniProcessors();
            // write the header
            beanWriter.writeHeader(header);
            // write the beans
            for (final Union uni : uni_database.allUnion()) {
                beanWriter.write(uni, header, processors);
            }
        }
        try (ICsvListWriter listWriter = new CsvListWriter(new FileWriter(csvFilename_Mem),
                CsvPreference.STANDARD_PREFERENCE)) {
            final CellProcessor[] processors = putUniMemProcessors();
            List<Object> lst = Arrays.asList(new Object[]{"", "",
                    new GregorianCalendar(1919, Calendar.FEBRUARY, 25).getTime(), ""});
            final String[] header = new String[]{"uni_name", "stu_num", "join_date", "level"};
            // write the header
            listWriter.writeHeader(header);
            //List<String> lst = Arrays.asList(" "," "," "," ");
            for (Union uni : uni_database.allUnion()) {
                lst.set(0, String.valueOf(uni.uniName));
                for (final Union.member nm : uni.getAllMember()) {
                    lst.set(1, String.valueOf(nm.stu_num));
                    lst.set(2, nm.join_data);
                    lst.set(3, String.valueOf(nm.level));
                    listWriter.write(lst, processors);
                }
            }
        }
    }
}
