export function setTestData(){

//TESTDATEN: ////////////////////////////////////////////////////////
localStorage.clear();
let members = [];

const member1 = {
    email: "a@a.com",
accountCreated: true,
loggedIn: false,
    password: "aaa",
    userName: "Anna",
    teams: [
        { teamName: "Team A", isAdmin: true },
        { teamName: "Team B", isAdmin: false },
    ],
};

const member2 = {
    email: "b@b.com",
accountCreated: true,
loggedIn: false,
    password: "bbb",
    userName: "Betti",
    teams: [
        { teamName: "Team A", isAdmin: false },
        { teamName: "Team B", isAdmin: true },
    ],
};
const member3 = {
    email: "c@c.com",
accountCreated: true,
loggedIn: false,
    password: "ccc",
    userName: "Conni",
    teams: [
        { teamName: "Team A", isAdmin: false },
        { teamName: "Team B", isAdmin: false },
        { teamName: "Team C", isAdmin: true },
        { teamName: "Team D", isAdmin: true },
    ],
};

// const member4 = {
// 	email: "d@d.com",
// accountCreated: false,
// loggedIn: false,
// 	password: "",
// 	userName: "",
// 	teams: [
// 		{teamName: "Team C", isAdmin: false},
// 		{teamName: "Team D", isAdmin: false},
// 	]
// }
members.push(member1, member2, member3);
// console.log("Testdaten: ", members);
members.forEach(member => {localStorage.setItem(member.email, JSON.stringify(member))}); //andersrum: JSON.parse()
// console.log("Finde den Fehler", members[0].userName, members[1].teams);
// console.log("Teamname: ", members[2].teams[0].teamName)

//get all users from local storage:
let allUsers = [];
const member4 = {
    email: "d@d.com",
    accountCreated: false,
    loggedIn: false,
    password: "",
    userName: "",
    teams: [
        {teamName: "Team C", isAdmin: false},
        {teamName: "Team D", isAdmin: false},
    ]
}
localStorage.setItem(member4.email, JSON.stringify(member4));

for (let i = 0; i < localStorage.length; i++) {
    let key = localStorage.key(i);
    let user = JSON.parse(localStorage.getItem(key));
    allUsers.push(user);
}

console.log("Local Storage am Anfang: ", allUsers);
}