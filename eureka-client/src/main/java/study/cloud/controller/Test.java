package study.cloud.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: study-cloud
 * @description:
 * @author: liangxp
 * @create: 2019-03-12 18:09
 */
public class Test {
    public static void main(String[] args) {
        List<String> la = new ArrayList<>();
        List<Integer> lb = new ArrayList<>();
        System.out.println(la.getClass() == lb.getClass());
    }
}
