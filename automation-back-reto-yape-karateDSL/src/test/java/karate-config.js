function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    myVarName: 'Junior Cabrera Serna',
    apiUrlBooking: 'https://restful-booker.herokuapp.com',
  }
  if (env == 'dev') {
    //config.apiUrlPetStore = 'https://petstore.swagger.io/v2',
    // customize
    // e.g. config.foo = 'bar';
  } else if (env == 'e2e') {
    // customize
  }
  return config;
}