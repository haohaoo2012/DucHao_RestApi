# DucHao_RestApi
Rest API có sử dụng Database cho Employee

Quá trình Deloy thử APi
-------------------------------
@GetAPI
Ta sử dụng phần mềm postman

Chọn method GET và nhập đường dẫn http://localhost:8080/api/list/ để Get database
![Screenshot 2021-07-01 150554](https://user-images.githubusercontent.com/73508026/124089720-5adb7b80-da7e-11eb-9a94-06db15734776.png)


-----------------------------------------------------------------------------------------------------------------

@PostAPI
Chọn method POST và nhập đường dẫn http://localhost:8080/api/save để Post
![Screenshot 2021-07-01 151415](https://user-images.githubusercontent.com/73508026/124090666-4055d200-da7f-11eb-9136-158ee15fd492.png)
Sau khi  POST xong chúng ta qua lại GET rồi Send thì sẽ được kết quả như sau![Screenshot 2021-07-01 151748](https://user-images.githubusercontent.com/73508026/124091099-ad696780-da7f-11eb-834a-c8d6665233b9.png)



@DELETEAPI
Chọn method DELETE và nhập đường dẫn http://localhost:8080/api/delete  và chọn ID muốn xóa bằng cách thêm ID vào sau
VÍ dụ muốn xóa ID=1 thì nhập đường dẫn .../delete/1 để tiến hành DETELE
![Screenshot 2021-07-01 152408](https://user-images.githubusercontent.com/73508026/124091841-7182d200-da80-11eb-8a92-78afc8e9e4b9.png)
Nếu xóa thành công sẽ hiển thị thông báo "Delete Sucessfully id =1".
Để kiểm tra lại Id=1 có bị xóa chưa thì quay lại  GET chạy thì sẽ thấy kết quả.



@PUTAPI
Chọn method DELETE và nhập đường dẫn http://localhost:8080/api/put và chọn nội dung cần PUT
Ta chọn nội dung cẩn sửa và tiến hành sửa
Sau khi PUT xong thì nội dung ở Id=2 có tên là Nguyen Thi B được đổi thành Nguyen Do Duc Hao như hình![Screenshot 2021-07-01 153131](https://user-images.githubusercontent.com/73508026/124092894-87dd5d80-da81-11eb-8b28-d775302462e7.png)


Và nội dung trong database cũng sẽ được cập nhập lại
![image](https://user-images.githubusercontent.com/73508026/124093195-d1c64380-da81-11eb-9dbd-bed6947f2ebf.png)

