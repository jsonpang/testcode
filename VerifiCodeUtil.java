

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VerifiCodeUtil {

	private static String[] fontNames = {"宋体","TimesRoman","Courier","Arial","楷体","黑体"};
	
	
	public static BufferedImage getBufferdImage(String str,int width,int height) {
		
		
		Random random = new Random(new Date().getTime());
		
		//设置背景颜色
		Color bgcolor = getRandomColor(random);

		
		
		int startx = 0;
		BufferedImage charImage = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
		Graphics2D charg = (Graphics2D) charImage.getGraphics();
		
		
		
		
		
		charg.setColor(bgcolor);;
		charg.fillRect(0, 0, width, height);
		
		for (int i = 0; i < str.length(); i++) {
			
			/* 随机旋转角度 */
			int degree = random.nextInt(360);
			
			/* 随机字体颜色 */
			Color frontcolor = getRandomColor(random);
			
			/* 随机字体  */
			String fontname = fontNames[random.nextInt(fontNames.length)];
			
			/* 是否加粗 */
			int isbold = random.nextInt(2);
			
			/* 随机字体大小 */
			int fontsize = 35 + random.nextInt(10);
			
			Font font = new Font(fontname,isbold ,fontsize);
			
			FontMetrics fm = sun.font.FontDesignMetrics.getMetrics(font);
			
			
			int charWidth = fm.charWidth(str.toCharArray()[i]);
			int charHeight = fm.getAscent(); 
			
			if(charWidth>charHeight) {
				startx  += charWidth /2 ;
			}else {
				startx  += charHeight /2 ;
			}
			
			
			int starty =  (height - charHeight)/2;
			
			int centerx = startx + charWidth/2;
			int centery = starty + charHeight/2;
			
			
			

			charg.translate(centerx, centery);
			charg.rotate(degree*Math.PI/180);
			charg.translate(-centerx, -centery);
			
			
			charg.setColor(frontcolor);
			charg.setFont(font);
			charg.drawString(""+str.toCharArray()[i], startx, starty+charHeight);
			
			charg.translate(centerx, centery);
			charg.rotate(-degree*Math.PI/180);
			charg.translate(-centerx, -centery);
			
			
			
			
			startx += charWidth;
		}
		
		/*干扰线*/
		for (int j = 0; j <5 + random.nextInt(10); j++) {
			int linex1 = random.nextInt(width);
			int liney1 = random.nextInt(height);
			
			int linex2 = random.nextInt(width);
			int liney2 = random.nextInt(height);
			
			int linewidth = random.nextInt(4) ;
			
			int arcx = random.nextInt(width);
			int arcy = random.nextInt(height);
			int arcw = random.nextInt(width);
			int arch = random.nextInt(height);
			int degree1 = random.nextInt(360);
			int degree2= random.nextInt(360);
			
			charg.setColor(getRandomColor(random));
			
			
			charg.setStroke( new BasicStroke( linewidth ) );
			
			charg.drawLine(linex1, liney1, linex2, liney2);
			charg.drawArc(arcx, arcy, arcw, arch, degree1, degree2);
			
		}
		
		/* 噪点 */
		for (int j = 0; j < 50+random.nextInt(10); j++) {
			
			int dotx  = random.nextInt(width-1);
			int doty = random.nextInt(height-1);
			
			Color randomColor = getRandomColor(random);
			int dotsize = random.nextInt(4) ;
			
			charg.setColor(randomColor);
			charg.setStroke(new BasicStroke(dotsize));
			
			charg.drawLine(dotx, doty, dotx, doty);
			
		}
		charg.dispose();
		return charImage;
		
		
	}
	
	private static Color getRandomColor(Random random) {
		char r = (char) random.nextInt(256);
		char g = (char) random.nextInt(256);
		char b = (char) random.nextInt(256);
		
		return new Color(r,g,b);
	}
	

    
    public static void main(String[] args) {  
          JFrame jFrame=new JFrame();  
          jFrame.setBounds(400, 400, 250, 250);  
            
          ImageIcon img = new ImageIcon(VerifiCodeUtil.getBufferdImage("ASdf23",300,100));   
          JLabel background = new JLabel(img);  
            
          jFrame.add(background);  
          jFrame.setVisible(true);  
          jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }  
}