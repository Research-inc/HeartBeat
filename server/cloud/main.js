
// Use Parse.Cloud.define to define as many cloud functions as you want.
// For example:
Parse.Cloud.define("whatsthisapp", function(request, response) {
  response.success("It is an app to aid in emergency situations.");
});
Parse.Cloud.define("pushsample", function (request, response) {
    Parse.Push.send({
        channels: ["channelName"],
        data: {
            title: "Hello!",
            message: "Hello from the Cloud Code",
        }
   }, {
        success: function () {
            // Push was successful
            response.sucess("push sent");
        },
        error: function (error) {
        // Push was unsucessful
        response.sucess("error with push: " + error);
        },
        useMasterKey: true
   });
});