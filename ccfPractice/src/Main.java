import java.util.Scanner;

public class Main {
    public static boolean inside(int x1, int y1 , int a , int b){
        if (x1>=0&&y1>=0){
            if (x1<=a&&y1<=b){
                //起点在里面
                return true;
            }
            //起点不在里面则退出
            else{
                return false;
            }
        }
        else return false;
    }


    public static void main(String[] args) {

        //ccf认证练习

        /**
         * 田地面积问题
         */
        //总面积
        int allS = 0;
        //代表选定区域的范围
        int a , b ;
        //选定的四个坐标
        int x1 ,y1 , x2 , y2;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         a = scanner.nextInt();
         b = scanner.nextInt();

         for (int i = 0 ; i<n;i++){
             x1 = scanner.nextInt();
             y1 = scanner.nextInt();
             x2 = scanner.nextInt();
             y2 = scanner.nextInt();
             //判断区域是否在区域内
             //假如起点位置在区域里面；
             if (inside(x1,y1,a,b)){
                 //判断终点是否也在里面
                 if (inside(x2,y2,a,b)){
                     //在里面则直接算出面积加入到总面积里面
                     allS += Math.abs(y2-y1)*Math.abs(x2-x1);
                 }
                 //如果终点不在里面
                 else {
                     //如果是y2超出b范围x2没有超出
                     if((y2>b || y2<0)&&x2>=0&&x2<=a){
                         if (y2>b){
                             allS += Math.abs((x2-x1))  * (b-y1);
                         }

                         else {
                             allS += Math.abs((x2-x1))  * y1;
                         }
                     }

                     //如果是x2超出a范围而y2没有超出
                     if((x2>a || x2<0)&&y2>=0&&y2<=b){
                         if (x2>a){
                             allS += Math.abs((y2-y1))  * (a-x1);
                         }

                         else {
                             allS += Math.abs((y2-y1))  * x1;
                         }
                     }

                     //如果说x2 y2都不在范围里面
                     if((x2>a || x2<0)&&(y2>b||y2<0)){
                         if (x2>a && y2>b){
                             allS += (a-x1) * (b-y1);
                         }
                         else if (x2>a && y2<0){
                             allS += (a-x1) * y1;
                         }
                         else if (x2<0 && y2>b){
                             allS += x1 * (b-y2);
                         }
                         else if (x2<0 && y2<0){
                             allS += x1*y1;
                         }
                     }
                 }
             }
             //如果起点不在
             else {
                 //首先交换起点终点看是否存在
                int temp = 0;
                temp = x1;
                x1 = x2;
                x2 = temp;
                temp = y1;
                y1 = y2;
                y2 = temp;
                 if (inside(x1,y1,a,b)){
                     //判断终点是否也在里面
                     if (inside(x2,y2,a,b)){
                         //在里面则直接算出面积加入到总面积里面
                         allS += Math.abs(y2-y1)*Math.abs(x2-x1);
                     }
                     //如果终点不在里面
                     else {
                         //如果是y2超出b范围x2没有超出
                         if((y2>b || y2<0)&&x2>=0&&x2<=a){
                             if (y2>b){
                                 allS += Math.abs((x2-x1))  * (b-y1);
                             }

                             else {
                                 allS += Math.abs((x2-x1))  * y1;
                             }
                         }

                         //如果是x2超出a范围而y2没有超出
                         if((x2>a || x2<0)&&y2>=0&&y2<=b){
                             if (x2>a){
                                 allS += Math.abs((y2-y1))  * (a-x1);
                             }

                             else {
                                 allS += Math.abs((y2-y1))  * x1;
                             }
                         }

                         //如果说x2 y2都不在范围里面
                         if((x2>a || x2<0)&&(y2>b||y2<0)){
                             if (x2>a && y2>b){
                                 allS += (a-x1) * (b-y1);
                             }
                             else if (x2>a && y2<0){
                                 allS += (a-x1) * y1;
                             }
                             else if (x2<0 && y2>b){
                                 allS += x1 * (b-y2);
                             }
                             else if (x2<0 && y2<0){
                                 allS += x1*y1;
                             }
                         }
                     }
                 }
                 //两个点都不在范围里面
                 else {
                     //对角线切换
                   temp = y1;
                   y1 = y2;
                   y2 = temp;
                     if (inside(x1,y1,a,b)){
                         //判断终点是否也在里面
                         if (inside(x2,y2,a,b)){
                             //在里面则直接算出面积加入到总面积里面
                             allS += Math.abs(y2-y1)*Math.abs(x2-x1);
                         }
                         //如果终点不在里面
                         else {
                             //如果是y2超出b范围x2没有超出
                             if((y2>b || y2<0)&&x2>=0&&x2<=a){
                                 if (y2>b){
                                     allS += Math.abs((x2-x1))  * (b-y1);
                                 }

                                 else {
                                     allS += Math.abs((x2-x1))  * y1;
                                 }
                             }

                             //如果是x2超出a范围而y2没有超出
                             if((x2>a || x2<0)&&y2>=0&&y2<=b){
                                 if (x2>a){
                                     allS += Math.abs((y2-y1))  * (a-x1);
                                 }

                                 else {
                                     allS += Math.abs((y2-y1))  * x1;
                                 }
                             }

                             //如果说x2 y2都不在范围里面
                             if((x2>a || x2<0)&&(y2>b||y2<0)){
                                 if (x2>a && y2>b){
                                     allS += (a-x1) * (b-y1);
                                 }
                                 else if (x2>a && y2<0){
                                     allS += (a-x1) * y1;
                                 }
                                 else if (x2<0 && y2>b){
                                     allS += x1 * (b-y1);
                                 }
                                 else if (x2<0 && y2<0){
                                     allS += x1*y1;
                                 }
                             }
                         }
                     }
                     else {
                         temp = x1;
                         x1 = x2;
                         x2 = temp;
                         temp = y1;
                         y1 = y2;
                         y2 = temp;
                         if (inside(x1,y1,a,b)){
                             //判断终点是否也在里面
                             if (inside(x2,y2,a,b)){
                                 //在里面则直接算出面积加入到总面积里面
                                 allS += Math.abs(y2-y1)*Math.abs(x2-x1);
                             }
                             //如果终点不在里面
                             else {
                                 //如果是y2超出b范围x2没有超出
                                 if((y2>b || y2<0)&&x2>=0&&x2<=a){
                                     if (y2>b){
                                         allS += Math.abs((x2-x1))  * (b-y1);
                                     }

                                     else {
                                         allS += Math.abs((x2-x1))  * y1;
                                     }
                                 }

                                 //如果是x2超出a范围而y2没有超出
                                 if((x2>a || x2<0)&&y2>=0&&y2<=b){
                                     if (x2>a){
                                         allS += Math.abs((y2-y1))  * (a-x1);
                                     }

                                     else {
                                         allS += Math.abs((y2-y1))  * x1;
                                     }
                                 }

                                 //如果说x2 y2都不在范围里面
                                 if((x2>a || x2<0)&&(y2>b||y2<0)){
                                     if (x2>a && y2>b){
                                         allS += (a-x1) * (b-y1);
                                     }
                                     else if (x2>a && y2<0){
                                         allS += (a-x1) * y1;
                                     }
                                     else if (x2<0 && y2>b){
                                         allS += x1 * (b-y2);
                                     }
                                     else if (x2<0 && y2<0){
                                         allS += x1*y1;
                                     }
                                 }
                             }
                         }

                     }
                 }

             }



         }
         System.out.println(allS);
         }


}