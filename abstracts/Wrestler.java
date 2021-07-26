
package abstracts;

public abstract class Wrestler {

    public void payStubs(int hours, Object wrestlerName){
        System.out.println("inside abstract class with pay rate info: $" + hours * 256
                + " for Wrestler: "
                + wrestlerName.getClass().getSimpleName()
        );
    }

    public abstract String theMusic(String music);
    public abstract void finisher();
}
