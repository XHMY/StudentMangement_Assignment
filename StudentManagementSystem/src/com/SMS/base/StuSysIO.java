package com.SMS.base;

import org.supercsv.cellprocessor.*;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.*;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

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
                new ParseInt(), // 学号
                new ParseDate("yyyy/MM/dd"), // 加入日期
                new NotNull()// 职位
        };
    }

    private static CellProcessor[] putUniMemProcessors() {
        return new CellProcessor[]{
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
        ssio.sysImport(new Union(), "/Users/yokey/OneDrive/吉珠/Project/大一下课程设计/StudentManagementSystem/Data/unimem_test_data");
        ssio.sysImport(new Uni_Database(), "/Users/yokey/OneDrive/吉珠/Project/大一下课程设计/StudentManagementSystem/Data/uin_test_data");
    }

    public void sysImport(Stu_Database stu_database, String csvFilename) throws IOException {
        try (ICsvBeanReader beanReader = new CsvBeanReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getStuProcessors();
            Student stu;
            while ((stu = beanReader.read(Student.class, header, processors)) != null) {
                //System.out.println(String.format("lineNo=%s, rowNo=%s, stu=%s", beanReader.getLineNumber(), beanReader.getRowNumber(), stu));
                stu_database.add_stu(stu.num, stu);
            }
        }
    }

    public void sysImport(Uni_Database uni_database, String csvFilename) throws IOException {
        try (ICsvBeanReader beanReader = new CsvBeanReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getUniProcessors();
            Union uni;
            while ((uni = beanReader.read(Union.class, header, processors)) != null) {
                //System.out.println(String.format("lineNo=%s, rowNo=%s, stu=%s", beanReader.getLineNumber(), beanReader.getRowNumber(), stu));
                uni_database.add_uni(uni);
            }
        }
    }

    public void sysImport(Union uni, String csvFilename) throws IOException {
        try (ICsvMapReader mapReader = new CsvMapReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE)) {
            // the header columns are used as the keys to the Map
            final String[] header = mapReader.getHeader(true);
            final CellProcessor[] processors = getUniMemProcessors();
            Map<String, Object> customerMap;
            while ((customerMap = mapReader.read(header, processors)) != null) {
                //System.out.println(String.format("lineNo=%s, rowNo=%s, customerMap=%s", mapReader.getLineNumber(), mapReader.getRowNumber(), customerMap));
                uni.joinMember((Integer) customerMap.get("stu_num"), (Date) customerMap.get("join_date"), (String) customerMap.get("level"));
            }
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

    public void sysExport(Uni_Database uni_database, String csvFilename) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFilename),
                CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[]{"name", "from", "type"};
            final CellProcessor[] processors = putUniProcessors();
            // write the header
            beanWriter.writeHeader(header);
            // write the beans
            for (final Union uni : uni_database.allUnion()) {
                beanWriter.write(uni, header, processors);
            }
        }
    }

    public void sysExport(Union uni, String csvFilename) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFilename),
                CsvPreference.STANDARD_PREFERENCE)) {
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[]{"stu_num", "join_date", "level"};
            final CellProcessor[] processors = putUniMemProcessors();
            // write the header
            beanWriter.writeHeader(header);
            // write the beans
            for (final Union.member nm : uni.getAllMember()) {
                beanWriter.write(nm, header, processors);
            }
        }
    }
}
