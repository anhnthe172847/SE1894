package enhance;




public class Main {

    public static void main(String[] args) {
        //nếu chỉ dừng lại giải các phương trình bậc N trong hàm main này
        // thì coi như thất bại: vì chương trình có cấu trúc vô cùng phức tạp, rối rắm
        //khó kiểm soát, khó bảo trì, khó nâng cấp, không khoa học
        //Ta sẽ tìm cách trị bài toán này theo một cách khoa học, ít rối rắm, dễ kiểm soát, bảo trì, nâng cấp
        // bằng kĩ thuật lập trình 00P
        //giả sử ta dừng lại ở giải hai cấp PTB1 và PTB2 đầu tiên
        boolean isDisplayResult = true; //tôi muốn mỗi lần giải xong thì hiển thị luôn kết quả
        String result = "";
        //PTB1: các test cases
        PTB1 pt1 = new PTB1();
        pt1.updateHS(3, 5);
        result = pt1.solve(isDisplayResult);

        pt1.updateHS(0, 0);
        result = pt1.solve(isDisplayResult);
        pt1.updateHS(0, 5);
        result = pt1.solve(isDisplayResult);

        System.out.println("=== PTB2 part ===");
        //PTB2

        PTB2 pt2 = new PTB2();
        pt2.updateHS(0,3,5);
        result = pt2.solve(isDisplayResult);
        
        pt2.updateHS(0,0,0); 
        result = pt2.solve(isDisplayResult);

        pt2.updateHS(0,0,5); 
        result = pt2.solve(isDisplayResult);
  
        //3 trường hợp còn lại của PTB2 dạng đầy đủ 
        pt2.updateHS(2,3,-5); //2 nghiệm 
        result = pt2.solve (isDisplayResult);

        pt2.updateHS(2,1,6); //vô nghiệm 
        result = pt2.solve( isDisplayResult);
 
        pt2.updateHS(1,2,1); //nghiệm kép 
        result = pt2.solve(isDisplayResult);

  
}
}
