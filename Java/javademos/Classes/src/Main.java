public class Main {

    public static void main(String[] args) {
        //referance type
	CustomerManager customerManager=new CustomerManager();//Class ın ismini yaz ve o türdeki ismi ver(C deki struct gibi)
    CustomerManager customerManager2=new CustomerManager();
    customerManager=customerManager2;
    customerManager.Add();
    customerManager.RemoveCustomer();
    customerManager.UpdateCustomer();
    //value
        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }
}
