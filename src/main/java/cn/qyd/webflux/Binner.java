package cn.qyd.webflux;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Binner {

    public static void main(String[] args) throws Exception {

        //Class.getResource("文件名")查找带有给定名称的资源。直接写文件名是在同一级目录下查找
        //如果文件在上一层目录的话要在文件名称前/
        File test1 = new File(Binner.class.getResource("banner0.txt").getFile());
        readTxt(test1);

    }

    //建立一个读文件的方法
    public static void readTxt(File file) throws Exception {
        /**
         * Author: chenqi@tansun.com.cn
         * Date: 2017/2/8:17:37
         * @param file
         *
         * Description:
         * version:1
         */
        //创建一个读取文件的流对象
        FileReader fileReader = new FileReader(file);
        //bufferreader知识进行了一下封装，是读取的效率更高
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //定义一个空字符串
        String str;
        //此处判断切记不能用if
        //bufferedReader.readLine()是读取文件的一行，如果有多行，会逐行读取。
        //当每一行不为空时则把内容打印到控制台中，也可以存到写入的流中，把内容写到文本里
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
        //最后不要忘记关流
        fileReader.close();

    }
}