describe (" text zoo site ",function(){
it ("to test COrrect page",function(){
browser.get("http://www.thetestroom.com/jswebapp");
expect(browser.getCurrentUrl()).toContain("jswebapp");
expect(browser.getCurrentUrl()).toEqual("http://www.thetestroom.com/jswebapp/");
});



it (" to test input and check output ",function(){
browser.get("http://www.thetestroom.com/jswebapp");
var textmessage = "Hi Akhil";

element(by.model("person.name")).sendKeys(textmessage);
element(by.binding("person.name")).getText().then(function(text){
	
expect(text).toEqual("Hi Akhil");
});
});

it (" to test dropdown",function(){
browser.get("http://www.thetestroom.com/jswebapp");
element(by.buttonText("CONTINUE")).click();
element(by.model("animal")).$('[value="1"]').click();

element.all(by.css(".ng-pristine option")).then(function(items){
	expect(items.length).toBe(4);
	expect(items[1].getText()).toBe("George the Turtle");
});
element(by.partialButtonText("CONT")).click();

});


it (" to test Thank you page",function(){
browser.get("http://www.thetestroom.com/jswebapp");
element(by.buttonText("CONTINUE")).click();
element(by.partialButtonText("CONT")).click();
expect(browser.getCurrentUrl()).toContain("confirm");

});
});