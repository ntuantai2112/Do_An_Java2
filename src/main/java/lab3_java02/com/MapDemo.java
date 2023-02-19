/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_java02.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author LENOVO T560
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();
        Student sv = new Student("Tuấn", 5, "Công nghệ thông tin");
        // thêm đối tượng vào trong map
        // key là tuấn ,value là đối tượng student Tuấn 
        map.put(sv.getName(), sv);
        map.put("nam", new Student("nam", 8, "Tự động hóa!"));
        
        // Lấy phần tử trong map sd hàm get() truyền vào key 
        // Lấy hết tất cả các key trong map ta sd hàm keySet(), hàm keySet() trả về 1 tập các key trong map  
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Student sv1 = map.get(key);
            System.out.println("Ho ten:" + sv1.getName());
            System.out.println("Hoc luc:" + sv1.getGrade());
        }

//        Student sv2 = map.get("nam");
//        System.out.println("Ho ten:" + sv2.getName());
//        System.out.println("Hoc luc:" + sv2.getGrade());
    }
}
