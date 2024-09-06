//bizim çalışanımız
public class Worker implements IWorkable, IEatable, IPayable{
    @Override
    public void work() {
        System.out.println("09.00 - 17.00 arası mesai saatidir.");
    }

    @Override
    public void eat() {
        System.out.println("Günlük 300 TL yemek ücreti ödenir.");
    }

    @Override
    public void pay() {
        System.out.println("Ay başında maaşlar yatar.");
    }
}
