import java.util.PriorityQueue;

public class nearby_cars {
    static class point implements Comparable<point> {
    
      int x ;
      int y;
      int disSq;
      int idx;
      public point(int x,int y,int disSq,int idx){
         this.x=x;
         this.y=y;
         this.disSq=disSq;
         this.idx = idx;
      }
      @Override
      public  int compareTo(point p2){
         return this.disSq-p2.disSq;
      }
     
     
         
      }
 public static void main(String[] args) { 
  int pts[][]= {{3,3},{5,-1},{-2,4}};
  int k=2;
   PriorityQueue<point> pqc =new PriorityQueue<>();
   for(int i=0;i<pts.length;i++){
      int disSq=pts[i][0]*pts[i][0] +  pts[i][1]* pts[i][1];
      pqc.add(new point(pts[i][0], pts[i][1], disSq,i));
   }
   for(int i=0;i<k;i++){
      System.out.println("C"+pqc.remove().idx);
   }
 }

}
