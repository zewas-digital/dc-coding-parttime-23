export function setTestData(){

//TESTDATEN: ////////////////////////////////////////////////////////
// localStorage.clear();
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

members.push(member1, member2, member3, member4);

if (typeof window !== 'undefined') {
    localStorage.clear;
    members.forEach(member => {localStorage.setItem(member.email, JSON.stringify(member))}); //andersrum: JSON.parse()
}

// for (let i = 0; i < localStorage.length; i++) {
//     let key = localStorage.key(i);


    
//     let user = JSON.parse(localStorage.getItem(key));
//     // console.log("Key: ", key, "VAlue: ", user);
//     allUsers.push(user);
// }

console.log("Local Storage am Anfang: ", members);

}