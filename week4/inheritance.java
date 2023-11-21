import java.util.*;

class Shape
{
     int length;
     int breadth;
     int side;
     int radius;
     
     void getArea()
     {
            return;
     }
     void getPerimeter()
     {
            return;
     }
};

class Square extends Shape
{
      Square(int side) 
      {
            this.side=side;
      }
      
      void getArea() 
      {
            System.out.println("Area of the Square with Side "+this.side+": "+side*side);
      }
      
      void getPerimeter() 
      {
            System.out.println("Area of the Square with Side "+this.side+": "+4*side);
      }
}

class Rectangle extends Shape
{
      Rectangle(int length,int breadth) 
      {
            this.length=length;
            this.breadth=breadth;
      }
      
      void getArea() 
      {
            System.out.println("Area of the Rectangle with Length "+this.length+" And Breadth "+this.breadth+": "+this.length*this.breadth);
      }
      
      void getPerimeter() 
      {
            System.out.println("Area of the Rectangle with Length "+this.length+" And Breadth "+this.breadth+": "+2*(this.length+this.breadth));
      }
}

class Circle extends Shape
{
      Circle(int radius)
      {
             this.radius=radius;
      }
      
      void getArea()
      {
             System.out.println("Area of the Circle with "+this.radius+": "+3.14*radius*radius);
      }
      
      void getPerimeter()
      {
             System.out.println("Area of the Circle with "+this.radius+": "+2*3.14*radius);
      }
}

class Main
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter \n1.Square\n2.Rectangle\n3.Circle");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
                  int side=sc.nextInt();
                  Square sq=new Square(side);
                  sq.getArea();
                  sq.getPerimeter();
                  break;
           case 2:
                  int length=sc.nextInt();
                  int breadth=sc.nextInt();
                  Rectangle r=new Rectangle(length,breadth);
                  r.getArea();
                  r.getPerimeter();
                  break;
                  
          case 3:
                 int radius=sc.nextInt();
                 Circle c=new Circle(radius);
                 c.getArea();
                 c.getPerimeter();
                 break;
        }
     }
}








