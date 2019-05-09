public class Point3DTest {
  public static void main(String[] args) {
    Point3D point3d = new Point3D();
    System.out.println(point3d);
    point3d = new Point3D(2.1f, 2.1f, 2.1f);
    System.out.println(point3d);
    point3d.show(point3d.getXYZ());//used array
  }
}