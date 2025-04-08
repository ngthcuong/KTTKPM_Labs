Bài toán 1: Một Khoa có nhiều lớp học, một lớp học (Tên lớp học) thì có nhiều sinh viên, lớp trưởng có một số thông tin muốn thông báo đến tất cả các sinh viên.

Hãy áp dụng Observer Design Pattern để giải bài toán trên.
Yêu cầu: vẽ sơ đồ trước khi viết code.

Các thành phần tham gia trong một Observer Pattern
- Subject: đối tượng chứa danh sách các Observer, cung cấp phương thức để thêm, xóa Observer khỏi danh sách, cung cấp phương thức để thông báo cho tất cả các Observer biết về sự thay đổi của Subject.
- Observer: đối tượng cần biết thông tin khi Subject thay đổi.
- ConcreteSubject: cài đặt các phương thức của Subject.
- ConcreteObserver: cài đặt phương thức cập nhật thông tin khi Subject thay đổi.

Trong trường hợp của bài toán trên:
- Subject:  ClassLeader
- Observer:  Alumnus
- ConcreteSubject: ClassLeader
- ConcreteObserver: Alumnus

