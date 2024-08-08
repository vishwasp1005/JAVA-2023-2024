//7(4)Create interface EventListener with performEvent() method. Create 
// MouseListener interface which inherits EventListener along with 
// mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), 
// mouseDragged() methods. Also create KeyListener interface which 
// inherits EventListener along with keyPressed(), keyReleased() 
// methods. WAP to create EventDemo class which implements 
// MouseListener and KeyListener and demonstrate all the methods of 
// the interfaces.


public class MouseEvent {
    public static void main(String[] args) {
        EventDemo e1 = new EventDemo();
        e1.mouseClicked();
        e1.mouseDragged();
        e1.mouseMoved();
        e1.mousePressed();
        e1.mouseReleased();
        e1.keyPressed();
        e1.keyReleased();
        e1.performEvent();
    }
}
interface EventListener{
    public void performEvent();
}   

interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();  
}

class EventDemo implements MouseListener, KeyListener{
    public void mouseClicked(){
        System.out.println("mouse clicked");
    }
    public void mousePressed(){
        System.out.println("mousePressed");
    }
    public void mouseReleased(){
        System.out.println("mouseReleased");
    }
    public void mouseMoved(){
        System.out.println("mouseMoved");
    }
    public void mouseDragged(){
        System.out.println("mouseDragged");
    }
    public void keyPressed(){
        System.out.println("keyPressed");
    }
    public void keyReleased(){
        System.out.println("keyReleased");
    }
    public void performEvent(){
        System.out.println("performEvent");
    }
}