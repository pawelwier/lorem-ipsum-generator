package com.example.loremipsum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoremIpsumApplicationTests {

	@Test
	public void contextLoads() {
		LoremCreateText lw1 = new LoremWordCreateText();
		LoremCreateText lp1 = new LoremParagraphCreateText();
		LoremCreateText ls1 = new LoremSentenceCreateText();
		assertEquals("Lorem ipsum dolor ", lw1.getLoremText(3) );
		assertEquals("Lorem ", lw1.getLoremText(1) );
		assertEquals("", lw1.getLoremText(0) );
		assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In hendrerit ligula eget augue dapibus, vitae maximus odio dapibus. Maecenas in tortor laoreet, ullamcorper metus quis, finibus magna. Quisque condimentum leo a diam hendrerit, ac malesuada nisi vestibulum. Suspendisse mollis tincidunt mattis. Vivamus scelerisque, nisl nec congue interdum, massa erat eleifend lectus, eget suscipit massa dolor vitae mauris. Nam congue, turpis eget rutrum euismod, est leo eleifend arcu, at viverra elit eros eget magna. Maecenas in leo cursus, efficitur lectus ut, aliquam neque. Fusce tellus enim, porttitor a cursus volutpat, consequat eget nibh. Nulla ut mi sed nunc efficitur gravida. Cras nec dolor tempor, feugiat erat at, consequat est. Interdum et malesuada fames ac ante ipsum primis in faucibus. Curabitur fermentum orci tortor, nec euismod eros commodo eu. Maecenas iaculis molestie turpis ac maximus. Curabitur ante magna, elementum in vestibulum non, fringilla sed leo. Duis non sapien ac sem semper venenatis in eu sapien. Proin suscipit erat vitae augue sollicitudin hendrerit. Duis a arcu ac dui sollicitudin aliquam. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam vel facilisis est, ac congue nisl. Pellentesque interdum, nisl ut mollis pretium, quam eros semper tortor, vitae finibus turpis ipsum vel tellus. Nam fermentum lectus in lectus volutpat viverra. Fusce luctus tellus nec tellus posuere tristique. Nullam nec quam ultricies, imperdiet eros ut, ultricies dui. Vivamus dolor augue, tempor ut tempus at, vestibulum sollicitudin metus. Proin nec pharetra leo. Pellentesque felis sem, rutrum vitae laoreet eu, malesuada accumsan tortor. Integer convallis libero nec est rhoncus fermentum. Sed scelerisque mauris a massa semper suscipit. Nulla erat ipsum, tristique egestas nibh et, pulvinar vulputate purus. Sed convallis orci ac interdum congue. Sed convallis justo quis enim malesuada, eget auctor justo rutrum. Duis pretium lorem nec fringilla congue. Suspendisse blandit turpis mauris, nec lobortis est iaculis a. Sed quis consectetur risus. Nam molestie sit amet ex id finibus. Nulla ex ligula, imperdiet posuere enim ac, congue consequat ligula. Ut pretium pretium ante ac pulvinar. Vestibulum hendrerit odio a consequat varius. Nullam porttitor ultrices gravida. Pellentesque commodo leo odio. Proin scelerisque ante quis cursus gravida. Fusce pellentesque fringilla nisi, at porta elit tincidunt id. Nam sed ullamcorper velit. Etiam faucibus turpis vel enim venenatis, eu pretium tortor lobortis. Proin ultrices, nulla vitae mattis luctus, sem velit sagittis arcu, non lacinia neque mi nec magna. Proin dapibus pharetra lacus vel egestas. Fusce vel laoreet dolor, vitae interdum tellus. Ut elementum, enim at suscipit suscipit, nulla lorem semper lorem, nec tempor lorem sem sit amet nisi. Aenean porttitor dolor libero, eget pulvinar dui pellentesque at. Pellentesque aliquam at elit non facilisis. Vivamus viverra sit amet lorem vel consectetur. Cras blandit fermentum tortor et sagittis. Sed ornare elit at justo dictum ultricies at nec enim. Suspendisse id elit id urna mollis iaculis. Morbi non vehicula tortor, at rhoncus libero. Nam at tortor a mauris efficitur pulvinar eu sit amet ex. Quisque arcu eros, sodales at dignissim id, fermentum id orci. Integer et purus ut urna egestas ultrices. ", lp1.getLoremText(5) );
		assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In hendrerit ligula eget augue dapibus, vitae maximus odio dapibus. Maecenas in tortor laoreet, ullamcorper metus quis, finibus magna. Quisque condimentum leo a diam hendrerit, ac malesuada nisi vestibulum. Suspendisse mollis tincidunt mattis. Vivamus scelerisque, nisl nec congue interdum, massa erat eleifend lectus, eget suscipit massa dolor vitae mauris. Nam congue, turpis eget rutrum euismod, est leo eleifend arcu, at viverra elit eros eget magna. ", ls1.getLoremText(7) );
	}

}
