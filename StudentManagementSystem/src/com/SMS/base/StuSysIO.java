package com.SMS.base;

import org.supercsv.cellprocessor.ParseBool;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.ParseLong;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.*;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class StuSysIO {
    private static CellProcessor[] getStuProcessors() {

        final CellProcessor[] processors = new CellProcessor[]{
                new ParseInt(), // 学号
                new NotNull(), // 姓名
                new ParseBool("男","女"), // 性别
                new ParseInt(), // 班别
                new NotNull(), // 专业
                new NotNull(), // 学院
                new ParseLong(), // 电话
                new NotNull(), // 微信ID
                new ParseInt(), //入学年份
                new NotNull() //宿舍
        };

        return processors;
    }
    private static CellProcessor[] getUniMemProcessors() {

        final CellProcessor[] processors = new CellProcessor[]{
                new ParseInt(), // 学号
                new ParseDate("yyyy/MM/dd"), // 加入日期
                new NotNull()// 职位

        };

        return processors;
    }

    public void importStu(Stu_Database stu_database ,String csvFilename) throws IOException {
        ICsvBeanReader beanReader = null;
        try {
            beanReader = new CsvBeanReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE);

            // the header elements are used to map the values to the bean (names must match)
            final String[] header = beanReader.getHeader(true);
            final CellProcessor[] processors = getStuProcessors();

            Student stu;
            while( (stu = beanReader.read(Student.class, header, processors)) != null ) {
                //System.out.println(String.format("lineNo=%s, rowNo=%s, stu=%s", beanReader.getLineNumber(), beanReader.getRowNumber(), stu));
                stu_database.add_stu(stu.num,stu);
            }
        }
        finally {
            if( beanReader != null ) {
                beanReader.close();
            }
        }
    }
    public void importUniMem(Union uni ,String csvFilename) throws IOException {
        ICsvMapReader mapReader = null;
        try {
            mapReader = new CsvMapReader(new FileReader(csvFilename), CsvPreference.STANDARD_PREFERENCE);

            // the header columns are used as the keys to the Map
            final String[] header = mapReader.getHeader(true);
            final CellProcessor[] processors = getUniMemProcessors();

            Map<String, Object> customerMap;
            while( (customerMap = mapReader.read(header, processors)) != null ) {
                //System.out.println(String.format("lineNo=%s, rowNo=%s, customerMap=%s", mapReader.getLineNumber(), mapReader.getRowNumber(), customerMap));
                uni.joinMember((Integer) customerMap.get("stu_num"),(Date) customerMap.get("join_date"),(String) customerMap.get("level"));
            }

        }
        finally {
            if( mapReader != null ) {
                mapReader.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StuSysIO ssio =new StuSysIO();
        ssio.importUniMem(new Union(),"/Users/yokey/OneDrive/吉珠/Project/大一下课程设计/StudentManagementSystem/Data/unimem_test_data");
    }
}
