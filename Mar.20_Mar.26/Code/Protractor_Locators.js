describe (" text zoo site ",function(){
it ("to test input and check output",function(){
browser.get("http://www.thetestroom.com/jswebapp");
element(by.model("person.name")).sendKeys("hi akhil");
element(by.binding("person.name")).getText().then(function(text){
console.log(text);
});
element(by.buttonText("CONTINUE")).click();
element(by.model("animal")).$('[value="1"]').click();
element(by.partialButtonText("CONT")).click();
});
});