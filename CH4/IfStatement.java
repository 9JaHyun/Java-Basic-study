public class IfStatement{
    public static void main(String[] args){
        
    }
    private void ifThen1(){
        int a = 5;
        if(a < 10){
            System.out.println("a는 10보다 작습니다.");
        }
    }

    private void ifThen2(){
        int a = 5;
        if(a < 10) System.out.println("a는 10보다 작습니다.");
    }

    private void if_Else(){
        int a = 5;
        if(a < 10){
            System.out.println("a는 10보다 작습니다.");
        } else {
            System.out.println("a는 10보다 큽니다.")
        }
    }

    private void if_ElseIf_Else(){
        int  a = 5;
        if(a > 5) {
            System.out.println("a가 5보다 큰 경우 코드 실행");
        }else if(a < 5) {
            System.out.println("a가 5보다 작은 경우 코드 실행");
        }else {
            System.out.println("a가 5인경우 코드 실행");
        }
    }

    private void nestedIf(){
        int a = 8;
        if(a > 5) {
            if(a < 10) {
                System.out.println("a가 5보다 크고 10보다 작으면 코드 실행");
            }else{
                System.out.println("a가 10이상이면 코드 실행");
            }
        }
    }

}