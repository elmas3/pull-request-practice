new Promise((resolve, reject) => {
  setTimeout(() => {
    console.log("3秒待機完了");
    resolve("Elmas is cute!");
  }, 3000);
}).then(msg => {
  console.log(msg);
}).catch(err => {
  console.error(err);
})