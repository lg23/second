import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * һ���򵥵�Draw2dʵ������Canvas��LightweightSystem��IFigure���
 */
public class HelloWorld {
	public static void main(String[] args) {
		
		//�½�Shell,Shell��Canvas������
		Shell shell = new Shell();
				
		shell.setText("Hello World");
		
		//���LightweihtSystemʵ��
		LightweightSystem lws = new LightweightSystem(shell);
		
		//���IFigureʵ��
		IFigure label = new Label("Hello World");
		
		//��IFigure��ӵ�LightweightSystem��
		lws.setContents(label);
		
                  shell.open();   
                  
		Display display = Display.getDefault();
		
		while(!shell.isDisposed()){
			
			if(!display.readAndDispatch()){
				
				display.sleep();
				
			}
			
		}

	}

}
  
