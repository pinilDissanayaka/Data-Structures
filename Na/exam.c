#include <stdio.h>

double AreaOfCircle(){
    double radius;
    double area;
    const double pi = 3.14159265358979323846264338;
    
    printf("Enter the dimensions of Shape:");
    
    printf("Enter radius for a circle : ");
    scanf("%lf", &radius);
    
    area = 2 * pi * radius * radius;
    return area;
}

double AreaOfRectangle(){
    double length;
    double width;
    double area;

    printf("Enter the dimensions of Shape:");
    printf("Enter length for a rectangle : ");
    scanf("%lf", &length);
    printf("Enter width for a rectangle : ");
    scanf("%lf", &width);
    
    area = length * width;
    return area;
}

double AreaOfTriangle(){
    double base;
    double height;
    double area;

    printf("Enter the dimensions of Shape:");
    printf("Enter base for a circle : ");
    scanf("%lf", &base);
    printf("Enter height for a circle : ");
    scanf("%lf", &height);
    
    area = base * height / 2;
    return area;
}

int main() {
    double area;
    int shapeNum;
    
    while(1){
        printf("\nArea calculator for geometric shapes\n");
        printf("Enter number for the corresponding shape : \n");
        printf("\t 1 - Circles\n");
        printf("\t 2 - Rectangles\n");
        printf("\t 3 - Triangles\n");
        printf("\t 0 - Exit\n");
        
        printf("Shape number : \t");
        scanf("%d", &shapeNum);
        printf("\n");
        
        if(shapeNum == 1){
            area = AreaOfCircle();
            printf("Area of circle == %lf \n", area);
        }
        else if(shapeNum == 2){
            area = AreaOfRectangle();
            printf("Area of rectangle == %lf \n", area);
        }
        else if(shapeNum == 3){
            area = AreaOfTriangle();
            printf("Area of triangle == %lf \n", area);
        }
        else if(shapeNum == 0){
            return 0;
        }
        else{
            printf("Enter number again...");
        }
    }
}