
//U10111003 朱永捷

import java.security.SecureRandom;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BeanMachine extends Application {

	// Creat a pane
	private Pane pane = new Pane();

	// Datafields : beans place and number of times
	private int a1 = 0;
	private int a2 = 0;
	private int a3 = 0;
	private int a4 = 0;
	private int a5 = 0;
	private int a6 = 0;
	private int a7 = 0;
	private int a8 = 0;
	private int cont = 0;

	public void start(Stage primaryStage) {
		
		// Creat the Bean Machine size
		Line l1 = new Line(140,40,140,60);
		l1.setStroke(Color.BLACK);
		pane.getChildren().add(l1);

		Line l2 = new Line(160,40,160,60);
		l2.setStroke(Color.BLACK);
		pane.getChildren().add(l2);

		Line l3 = new Line(140,60,50,240);
		l3.setStroke(Color.BLACK);
		pane.getChildren().add(l3);

		Line l4 = new Line(160,60,250,240);
		l4.setStroke(Color.BLACK);
		pane.getChildren().add(l4);

		Line l5 = new Line(50,280,250,280);
		l5.setStroke(Color.BLACK);
		pane.getChildren().add(l5);

		Line l6 = new Line(50,240,50,280);
		l6.setStroke(Color.BLACK);
		pane.getChildren().add(l6);

		Line l7 = new Line(75,240,75,280);
		l7.setStroke(Color.BLACK);
		pane.getChildren().add(l7);

		Line l8 = new Line(100,240,100,280);
		l8.setStroke(Color.BLACK);
		pane.getChildren().add(l8);

		Line l9 = new Line(125,240,125,280);
		l9.setStroke(Color.BLACK);
		pane.getChildren().add(l9);

		Line l10 = new Line(150,240,150,280);
		l10.setStroke(Color.BLACK);
		pane.getChildren().add(l10);

		Line l11 = new Line(175,240,175,280);
		l11.setStroke(Color.BLACK);
		pane.getChildren().add(l11);

		Line l12 = new Line(200,240,200,280);
		l12.setStroke(Color.BLACK);
		pane.getChildren().add(l12);

		Line l13 = new Line(225,240,225,280);
		l13.setStroke(Color.BLACK);
		pane.getChildren().add(l13);

		Line l14 = new Line(250,240,250,280);
		l14.setStroke(Color.BLACK);
		pane.getChildren().add(l14);


		// Creat and set Beans in Machine
		Circle b1 = new Circle(75,240,5);
		b1.setFill(Color.BLUE);
		pane.getChildren().add(b1);

		Circle b2 = new Circle(100,240,5);
		b2.setFill(Color.BLUE);
		pane.getChildren().add(b2);

		Circle b3 = new Circle(125,240,5);
		b3.setFill(Color.BLUE);
		pane.getChildren().add(b3);

		Circle b4 = new Circle(150,240,5);
		b4.setFill(Color.BLUE);
		pane.getChildren().add(b4);

		Circle b5 = new Circle(175,240,5);
		b5.setFill(Color.BLUE);
		pane.getChildren().add(b5);

		Circle b6 = new Circle(200,240,5);
		b6.setFill(Color.BLUE);
		pane.getChildren().add(b6);

		Circle b7 = new Circle(225,240,5);
		b7.setFill(Color.BLUE);
		pane.getChildren().add(b7);

		Circle b8 = new Circle(87.5,215,5);
		b8.setFill(Color.BLUE);
		pane.getChildren().add(b8);

		Circle b9 = new Circle(112.5,215,5);
		b9.setFill(Color.BLUE);
		pane.getChildren().add(b9);

		Circle b10 = new Circle(137.5,215,5);
		b10.setFill(Color.BLUE);
		pane.getChildren().add(b10);

		Circle b11 = new Circle(162.5,215,5);
		b11.setFill(Color.BLUE);
		pane.getChildren().add(b11);

		Circle b12 = new Circle(187.5,215,5);
		b12.setFill(Color.BLUE);
		pane.getChildren().add(b12);

		Circle b13 = new Circle(212.5,215,5);
		b13.setFill(Color.BLUE);
		pane.getChildren().add(b13);

		Circle b14 = new Circle(100,190,5);
		b14.setFill(Color.BLUE);
		pane.getChildren().add(b14);

		Circle b15 = new Circle(125,190,5);
		b15.setFill(Color.BLUE);
		pane.getChildren().add(b15);

		Circle b16 = new Circle(150,190,5);
		b16.setFill(Color.BLUE);
		pane.getChildren().add(b16);

		Circle b17 = new Circle(175,190,5);
		b17.setFill(Color.BLUE);
		pane.getChildren().add(b17);

		Circle b18 = new Circle(200,190,5);
		b18.setFill(Color.BLUE);
		pane.getChildren().add(b18);

		Circle b19 = new Circle(112.5,165,5);
		b19.setFill(Color.BLUE);
		pane.getChildren().add(b19);

		Circle b20 = new Circle(137.5,165,5);
		b20.setFill(Color.BLUE);
		pane.getChildren().add(b20);

		Circle b21 = new Circle(162.5,165,5);
		b21.setFill(Color.BLUE);
		pane.getChildren().add(b21);

		Circle b22 = new Circle(187.5,165,5);
		b22.setFill(Color.BLUE);
		pane.getChildren().add(b22);

		Circle b23 = new Circle(125,140,5);
		b23.setFill(Color.BLUE);
		pane.getChildren().add(b23);

		Circle b24 = new Circle(150,140,5);
		b24.setFill(Color.BLUE);
		pane.getChildren().add(b24);

		Circle b25 = new Circle(175,140,5);
		b25.setFill(Color.BLUE);
		pane.getChildren().add(b25);

		Circle b26 = new Circle(137.5,115,5);
		b26.setFill(Color.BLUE);
		pane.getChildren().add(b26);

		Circle b27 = new Circle(162.5,115,5);
		b27.setFill(Color.BLUE);
		pane.getChildren().add(b27);

		Circle b28 = new Circle(150,90,5);
		b28.setFill(Color.BLUE);
		pane.getChildren().add(b28);

		// Pause and play beans
		pane.setOnMouseClicked(e -> {
			if (cont < 10){
				playBean();
			}
		});

		// Creat a scene and place it in the stage
		Scene scene = new Scene(pane,300,300);
		// Set title
		primaryStage.setTitle("Bean Machine");
		// Place scene in the stage
		primaryStage.setScene(scene);
		// Display the stage
		primaryStage.show();
	}

	// Create a method which beans can move
	public void playBean(){
		// Creat and set main bean in Machine
		Circle bean = new Circle(150,40,5);
		bean.setFill(Color.RED);
		pane.getChildren().add(bean);

		// Create an animation and KeyFrame
		Timeline animation = new Timeline();

		KeyFrame start = new KeyFrame(Duration.ZERO, new KeyValue(bean.translateXProperty(), 0));
		KeyFrame ball1_1 = new KeyFrame(Duration.millis(100), new KeyValue(bean.translateXProperty(),0), new KeyValue(bean.translateYProperty(), 40));
		KeyFrame ball1_2 = new KeyFrame(Duration.millis(200), new KeyValue(bean.translateXProperty(),-12.5), new KeyValue(bean.translateYProperty(), 45));
		KeyFrame ball1_3 = new KeyFrame(Duration.millis(300), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(), 65));
		KeyFrame ball1_4 = new KeyFrame(Duration.millis(400), new KeyValue(bean.translateXProperty(),-25), new KeyValue(bean.translateYProperty(), 70));
		KeyFrame ball1_5 = new KeyFrame(Duration.millis(500), new KeyValue(bean.translateXProperty(),-25),new KeyValue(bean.translateYProperty(), 90));
		KeyFrame ball1_6 = new KeyFrame(Duration.millis(600), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),95 ));
		KeyFrame ball1_7 = new KeyFrame(Duration.millis(700), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),115 ));
		KeyFrame ball1_8 = new KeyFrame(Duration.millis(800), new KeyValue(bean.translateXProperty(),-50),new KeyValue(bean.translateYProperty(),120));
		KeyFrame ball1_9 = new KeyFrame(Duration.millis(900), new KeyValue(bean.translateXProperty(),-50),new KeyValue(bean.translateYProperty(),140 ));
		KeyFrame ball1_10 = new KeyFrame(Duration.millis(1000), new KeyValue(bean.translateXProperty(),-62.5),new KeyValue(bean.translateYProperty(),145 ));		
		KeyFrame ball1_11 = new KeyFrame(Duration.millis(1100), new KeyValue(bean.translateXProperty(),-62.5),new KeyValue(bean.translateYProperty(),165 ));
		KeyFrame ball1_12 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),-75),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball1_13 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),-75),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball1_14 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),-87.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball1_15 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),-87.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball1_16 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),-87.5),new KeyValue(bean.translateYProperty(),235+a1 ));

		KeyFrame ball2_1 = new KeyFrame(Duration.millis(200), new KeyValue(bean.translateXProperty(),12.5), new KeyValue(bean.translateYProperty(), 45));
		KeyFrame ball2_2 = new KeyFrame(Duration.millis(300), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(), 65));
		KeyFrame ball2_3 = new KeyFrame(Duration.millis(400), new KeyValue(bean.translateXProperty(),0), new KeyValue(bean.translateYProperty(), 70));
		KeyFrame ball2_4 = new KeyFrame(Duration.millis(500), new KeyValue(bean.translateXProperty(),0),new KeyValue(bean.translateYProperty(), 90));
		KeyFrame ball2_5 = new KeyFrame(Duration.millis(600), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),95 ));
		KeyFrame ball2_6 = new KeyFrame(Duration.millis(700), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),115 ));
		KeyFrame ball2_7 = new KeyFrame(Duration.millis(800), new KeyValue(bean.translateXProperty(),-25),new KeyValue(bean.translateYProperty(),120));
		KeyFrame ball2_8 = new KeyFrame(Duration.millis(900), new KeyValue(bean.translateXProperty(),-25),new KeyValue(bean.translateYProperty(),140 ));
		KeyFrame ball2_9 = new KeyFrame(Duration.millis(1000), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),145 ));		
		KeyFrame ball2_10 = new KeyFrame(Duration.millis(1100), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),165 ));
		KeyFrame ball2_11 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),-50),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball2_12 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),-50),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball2_13 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),-62.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball2_14 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),-62.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball2_15 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),-62.5),new KeyValue(bean.translateYProperty(),235+a2 ));

		KeyFrame ball3_1 = new KeyFrame(Duration.millis(400), new KeyValue(bean.translateXProperty(),25), new KeyValue(bean.translateYProperty(), 70));
		KeyFrame ball3_2 = new KeyFrame(Duration.millis(500), new KeyValue(bean.translateXProperty(),25),new KeyValue(bean.translateYProperty(), 90));
		KeyFrame ball3_3 = new KeyFrame(Duration.millis(600), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),95 ));
		KeyFrame ball3_4 = new KeyFrame(Duration.millis(700), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),115 ));
		KeyFrame ball3_5 = new KeyFrame(Duration.millis(800), new KeyValue(bean.translateXProperty(),0),new KeyValue(bean.translateYProperty(),120));
		KeyFrame ball3_6 = new KeyFrame(Duration.millis(900), new KeyValue(bean.translateXProperty(),0),new KeyValue(bean.translateYProperty(),140 ));
		KeyFrame ball3_7 = new KeyFrame(Duration.millis(1000), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),145 ));		
		KeyFrame ball3_8 = new KeyFrame(Duration.millis(1100), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),165 ));
		KeyFrame ball3_9 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),-25),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball3_10 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),-25),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball3_11 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball3_12 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball3_13 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),-37.5),new KeyValue(bean.translateYProperty(),235+a3 ));

		KeyFrame ball4_1 = new KeyFrame(Duration.millis(600), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),95 ));
		KeyFrame ball4_2 = new KeyFrame(Duration.millis(700), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),115 ));
		KeyFrame ball4_3 = new KeyFrame(Duration.millis(800), new KeyValue(bean.translateXProperty(),25),new KeyValue(bean.translateYProperty(),120));
		KeyFrame ball4_4 = new KeyFrame(Duration.millis(900), new KeyValue(bean.translateXProperty(),25),new KeyValue(bean.translateYProperty(),140 ));
		KeyFrame ball4_5 = new KeyFrame(Duration.millis(1000), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),145 ));		
		KeyFrame ball4_6 = new KeyFrame(Duration.millis(1100), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),165 ));
		KeyFrame ball4_7 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),0),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball4_8 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),0),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball4_9 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball4_10 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball4_11 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),-12.5),new KeyValue(bean.translateYProperty(),235+a4 ));

		KeyFrame ball5_1 = new KeyFrame(Duration.millis(800), new KeyValue(bean.translateXProperty(),50),new KeyValue(bean.translateYProperty(),120));
		KeyFrame ball5_2 = new KeyFrame(Duration.millis(900), new KeyValue(bean.translateXProperty(),50),new KeyValue(bean.translateYProperty(),140 ));
		KeyFrame ball5_3 = new KeyFrame(Duration.millis(1000), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),145 ));		
		KeyFrame ball5_4 = new KeyFrame(Duration.millis(1100), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),165 ));
		KeyFrame ball5_5 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),25),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball5_6 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),25),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball5_7 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball5_8 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball5_9 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),12.5),new KeyValue(bean.translateYProperty(),235+a5 ));

		KeyFrame ball6_1 = new KeyFrame(Duration.millis(1000), new KeyValue(bean.translateXProperty(),62.5),new KeyValue(bean.translateYProperty(),145 ));		
		KeyFrame ball6_2 = new KeyFrame(Duration.millis(1100), new KeyValue(bean.translateXProperty(),62.5),new KeyValue(bean.translateYProperty(),165 ));
		KeyFrame ball6_3 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),50),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball6_4 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),50),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball6_5 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball6_6 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball6_7 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),37.5),new KeyValue(bean.translateYProperty(),235+a6 ));

		KeyFrame ball7_1 = new KeyFrame(Duration.millis(1200), new KeyValue(bean.translateXProperty(),75),new KeyValue(bean.translateYProperty(),170 ));
		KeyFrame ball7_2 = new KeyFrame(Duration.millis(1300), new KeyValue(bean.translateXProperty(),75),new KeyValue(bean.translateYProperty(),190 ));
		KeyFrame ball7_3 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),62.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball7_4 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),62.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball7_5 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),62.5),new KeyValue(bean.translateYProperty(),235+a7 ));

		KeyFrame ball8_1 = new KeyFrame(Duration.millis(1400), new KeyValue(bean.translateXProperty(),87.5),new KeyValue(bean.translateYProperty(),195 ));
		KeyFrame ball8_2 = new KeyFrame(Duration.millis(1500), new KeyValue(bean.translateXProperty(),87.5),new KeyValue(bean.translateYProperty(),215 ));
		KeyFrame ball8_3 = new KeyFrame(Duration.millis(1600), new KeyValue(bean.translateXProperty(),87.5),new KeyValue(bean.translateYProperty(),235+a8 ));

		// Creat a SecureRandom
		SecureRandom random = new SecureRandom();
		int rd = random.nextInt(130)+1;


		// Shoe random beans
		switch(rd) {

			case 1:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball1_10,ball1_11,ball1_12,ball1_13,ball1_14,ball1_15,ball1_16);
				a1-=10;
				break;
			
			case 2:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball1_10,ball1_11,ball1_12,ball1_13,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 3:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball1_10,ball1_11,ball2_11,ball2_12,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 4:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball1_10,ball1_11,ball2_11,ball2_12,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 5:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball2_9,ball2_10,ball2_11,ball2_12,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 6:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball2_9,ball2_10,ball2_11,ball2_12,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 7:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball2_9,ball2_10,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 8:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball2_9,ball2_10,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 9:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 10:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 11:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 12:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 13:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 14:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 15:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 16:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 17:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 18:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 19:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 20:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 21:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 22:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 23:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 24:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 25:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 26:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 27:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 28:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 29:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 30:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 31:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 32:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 33:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 34:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 35:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 36:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 37:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 38:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 39:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 40:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 41:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 42:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 43:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 44:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 45:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 46:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 47:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 48:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 49:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 50:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 51:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 52:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 53:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 54:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 55:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 56:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 57:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 58:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 59:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 60:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 61:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 62:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 63:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 64:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 65:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball2_13,ball2_14,ball2_15);
				a2-=10;
				break;

			case 66:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball2_11,ball2_12,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 67:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 68:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball2_9,ball2_10,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 69:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 70:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 71:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 72:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball2_7,ball2_8,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 73:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 74:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 75:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 76:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 77:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 78:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 79:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 80:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball2_5,ball2_6,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 81:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 82:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 83:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 84:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 85:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 86:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 87:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 88:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 89:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 90:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 91:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 92:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 93:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 94:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 95:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 96:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball2_3,ball2_4,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 97:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball3_11,ball3_12,ball3_13);
				a3-=10;
				break;

			case 98:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball3_9,ball3_10,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 99:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 100:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball3_7,ball3_8,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 101:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 102:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 103:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 104:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball3_5,ball3_6,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 105:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 106:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 107:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 108:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 109:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 110:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 111:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 112:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball3_3,ball3_4,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 113:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball4_9,ball4_10,ball4_11);
				a4-=10;
				break;

			case 114:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball4_5,ball4_6,ball4_7,ball4_8,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 115:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 116:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball4_5,ball4_6,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 117:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;


			case 118:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball5_3,ball5_4,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 119:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 120:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball4_3,ball4_4,ball5_3,ball5_4,ball6_3,ball6_4,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 121:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball5_3,ball5_4,ball5_5,ball5_6,ball5_7,ball5_8,ball5_9);
				a5-=10;
				break;

			case 122:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball5_3,ball5_4,ball5_5,ball5_6,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 123:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball5_3,ball5_4,ball6_3,ball6_4,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 124:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball5_3,ball5_4,ball6_3,ball6_4,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 125:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball6_1,ball6_2,ball6_3,ball6_4,ball6_5,ball6_6,ball6_7);
				a6-=10;
				break;

			case 126:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball6_1,ball6_2,ball6_3,ball6_4,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 127:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball6_1,ball6_2,ball7_1,ball7_2,ball7_3,ball7_4,ball7_5);
				a7-=10;
				break;

			case 128:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball6_1,ball6_2,ball7_1,ball7_2,ball8_1,ball8_2,ball8_3);
				a8-=10;
				break;

			case 129:
				animation.getKeyFrames().addAll(start,ball1_1,ball1_2,ball1_3,ball1_4,ball1_5,ball1_6,ball1_7,ball1_8,ball1_9,ball1_10,ball1_11,ball1_12,ball1_13,ball1_14,ball1_15,ball1_16);
				a1-=10;
				break;

			case 130:
				animation.getKeyFrames().addAll(start,ball1_1,ball2_1,ball2_2,ball3_1,ball3_2,ball4_1,ball4_2,ball5_1,ball5_2,ball6_1,ball6_2,ball7_1,ball7_2,ball8_1,ball8_2,ball8_3);
				a8-=10;
				break;
		}
		animation.play();

		// Compute number of times
		cont++;

		// These beans doesn't out of the machine
		if (a1 == -40) {
			a1 = 0;
		} else if (a2 == -40) {
			a2 = 0;
		} else if (a3 == -40) {
			a3 = 0;
		} else if (a4 == -40) {
			a4 = 0;
		} else if (a5 == -40) {
			a5 = 0;
		} else if (a6 == -40) {
			a6 = 0;
		} else if (a7 == -40) {
			a7 = 0;
		} else if (a8 == -40) {
			a8 = 0;
		}
	}
}
