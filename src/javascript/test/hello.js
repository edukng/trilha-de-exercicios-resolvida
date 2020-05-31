const {expect} = require('chai');

step("Diz <saudacao>", async function(saudacao) {
    expect(saudacao).to.equal("Ola")
});