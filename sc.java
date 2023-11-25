import java.util.ArrayList;
public class sc {
    public static void main(String args[])
    {
        ArrayList<product> basket=new ArrayList<product>();
        basket.add(new product("leather wallet",1100,18,1));
        basket.add(new product("umbrella ",900,12,4));
        basket.add(new product("cigarette",200,28,3));
        basket.add(new product("honey",100,0,2));
        int total=0;
        String p=basket.get(0).item;
        int maxgst=basket.get(0).gst;
        for(int i=0;i<basket.size();i++)
        {
            total=total+(basket.get(i).unit)*(basket.get(i).qty);
            if(basket.get(i).gst>maxgst)
            {
                maxgst=basket.get(i).gst;
                p=basket.get(i).item;
            }

        }
        System.out.println("Total amount paid= "+total);
        System.out.println("Product with max gst = "+p);
    }
}
 class product
 {
     String item;
     int unit;
     int gst;
     int qty;
     public product(String i,int u,int gst,int qty)
     {
         this.item=i;
         this.unit=u;
         this.gst=gst;
         this.qty=qty;
     }
 }