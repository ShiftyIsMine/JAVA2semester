package JAVA1205._gui.Controller;

import JAVA1205._gui.View.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static int FRAME_WIDTH = 1100;
    public static int FRAME_HEIGHT = 500;
    public static int FRAME_X=300;
    public static int FRAME_Y=300;
    public MainFrame() {
        super("정보 검색 프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int a=(int)screenSize.getWidth();
        int b=(int)screenSize.getHeight();

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView,"Center");


        FRAME_X = (a-FRAME_X)/2;
        FRAME_Y = (b-FRAME_X)/2;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(FRAME_X,FRAME_Y);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);


    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
