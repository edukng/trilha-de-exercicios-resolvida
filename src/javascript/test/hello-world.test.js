const {expect} = require('chai');
const hello = require('../main/hello-world');

step("Diz <saudacao>", async function(saudacao) {
    expect(hello(saudacao)).to.equal("Ola, mundo")
});