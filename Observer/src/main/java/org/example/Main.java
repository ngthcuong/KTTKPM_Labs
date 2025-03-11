package org.example;

public class Main {
    public static void main(String[] args) {

//        Tạo ra lớp DHKTPM17C
        Class clazz = new Class(1, "DHKTPM17C");

//        Tạo ra lớp trưởng của lớp DHKTPM17C
        ClassLeader classLeader = new ClassLeader(1, "Lớp trưởng", clazz);

//        Tạo ra danh sách các sinh viên
        Student s1 = new Student(1, "Nguyen Van A");
        Student s2 = new Student(2, "Cao Tuan B");
        Student s3 = new Student(3, "Truong Thanh C");

//        Đăng ký sinh viên vào danh sách theo dõi (sub)
        clazz.attach(s1);
        clazz.attach(s2);
        clazz.attach(s3);

//        Lớp trưởng gửi thông báo
        classLeader.notifyStudents("Ngày mai có bài kiểm tra 15ph");

//        Gỡ một sinh viên khỏi danh sách
        clazz.detach(s2);

//        Gửi thông báo sau khi gỡ 1 sinh viên
        classLeader.notifyStudents("Cả lớp đăng ký làm lại thẻ sinh viên");
    }
}