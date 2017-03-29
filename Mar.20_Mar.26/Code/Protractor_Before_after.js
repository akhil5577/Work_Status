describe (" text zoo site ",function(){
	
	
	beforeEach(function(){
		browser.get("http://www.thetestroom.com/jswebapp");
	});
	
	afterEach(function(){});
	
it ("to test COrrect page",function(){
expect(browser.getCurrentUrl()).toContain("jswebapp");
expect(browser.getCurrentUrl()).toEqual("http://www.thetestroom.com/jswebapp/");
});


describe (" text zoo site ",function(){
	
	var textmessage = "Hi Akhil";
	beforeEach(function(){
		textmessage = "Hi Akhil";});
it (" to test correct input and check output ",function(){
element(by.model("person.name")).sendKeys(textmessage);
element(by.binding("person.name")).getText().then(function(text){
	
expect(text).toEqual("Hi Akhil");
});
});
it (" to test incorrect input and check output ",function(){
element(by.model("person.name")).sendKeys(textmessage);
element(by.binding("person.name")).getText().then(function(text){
	
expect(text).toNotEqual("Hi Akhil");
});
});
});
it (" to test dropdown",function(){
element(by.buttonText("CONTINUE")).click();
element(by.model("animal")).$('[value="1"]').click();

element.all(by.css(".ng-pristine option")).then(function(items){
	expect(items.length).toBe(4);
	expect(items[1].getText()).toBe("George the Turtle");
});
element(by.partialButtonText("CONT")).click();

});

it (" to test Thank you page",function(){
element(by.buttonText("CONTINUE")).click();
element(by.partialButtonText("CONT")).click();
expect(browser.getCurrentUrl()).toContain("confirm");

});
});