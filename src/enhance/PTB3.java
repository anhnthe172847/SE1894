package enhance;



public class PTB3 {
    // bậc 3 có thể bị suy biến về bậc 2

    double HS3, HS2, HS1, HS0;
    //update()...

    public String solve(boolean displayResult) {
        String result = "";
        if (HS3 == 0) { //suy biến, dùng lại kết quả xây dựng lớp PTB2 đã hoàn thành ở bước trước
            PTB2 temp = new PTB2();
             //gọi các hàm để update cho các hệ số của temp này
            result = temp.solve(displayResult);
            return result;
        } else {
        // lúc này là phương trình bậc 3 đầy đủ thì tiếp tục giải đúng trường hợp này ở đây
        //mà không cần phải lo lắng về việc nó có suy biến hay không nữa
        //vì đã xử nó ở phía trên rồi
            return "";
        }
    }
}
    