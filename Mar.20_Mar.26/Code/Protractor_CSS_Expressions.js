describe (" text zoo site ",function(){

beforeEach(function(){
		browser.get("http://www.thetestroom.com/jswebapp");
	});
	
	afterEach(function(){});

it("Test using CSS expressions",function(){
 
 //by css tag
element(by.css('input')).sendKeys("text test");

//by css class
element(by.css('.ng-binding')).getText().then(function(text){
console.log(text);
});

//by css id
element(by.css('#continue_button')).click();


//by chaining
element(by.css('button#continue_button')).click();

//css child nodes
element(by.css('table td a')).getText().then(function(text){
console.log(text);
});

//css attributes
element(by.css('[id="title"]')).getText().then(function(text){
console.log(text);
});

});

});