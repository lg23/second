import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * 一个简单的Draw2d实例，由Canvas、LightweightSystem和IFigure组成
 */
public class HelloWorld {
	public static void main(String[] args) {
		
		//新建Shell,Shell是Canvas的子类
		Shell shell = new Shell();
				
		shell.setText("Hello World");
		
		//添加LightweihtSystem实例
		LightweightSystem lws = new LightweightSystem(shell);
		
		//添加IFigure实例
		IFigure label = new Label("Hello World");
		
		//把IFigure添加到LightweightSystem中
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
  
