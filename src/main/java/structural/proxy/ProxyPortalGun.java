package structural.proxy;

public class ProxyPortalGun implements PortalGun {

    private RealPortalGun realPortalGun;
    private String userName;

    public ProxyPortalGun(String userName) {
        this.userName = userName;
        this.realPortalGun = new RealPortalGun();
    }

    public void relocate() {
        if (this.userName.equalsIgnoreCase("rick")) {
            this.realPortalGun.relocate();
        } else {
            System.out.println("Only rick can use portal gun.");
        }
    }
}
