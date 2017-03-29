var util= require('util');

describe (' text zoo site ',function(){
	
	
	beforeEach(function(){
		browser.get("http://www.thetestroom.com/jswebapp");
	});

xit ('to test adopt animal',function(){
element(by.model('person.name')).sendKeys('HI AKhil');
var dynamicText = element(by.binding('person.name')).getText();
expect(dynamicText).toBe('Hi Akhil');
element(by.buttonText('CONTINUE')).click();
element(by.model('animal')).$('[value="1"]').click();
element(by.buttonText('CONTINUE')).click();

var thankyouText = element(by.css('h1')).getText();
expect(thankyouText).toBe("Thank you");


});

var home_page = require('../page/home_page.js');
it('adopting an animal by page objects', function(){
	home_page.enterFieldValue('hi akhil');
	//home_page.clickContinue();
	var getHomePageText = home_page.getDynamicText();
	expect(getHomePageText).toBe("hi akhil");
	 var animal_page= home_page.clickContinue();
	 animal_page.selectAnimal(2);
	 var confirm_page= animal_page.clickContinue();
	 expect(confirm_page.getTitle()).toBe('Thank you');
	
});


});

