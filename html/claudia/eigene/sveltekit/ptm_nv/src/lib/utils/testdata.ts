export function setTestData() {

    //TESTDATEN: ////////////////////////////////////////////////////////

    //localStorage is not defined on server!
    if (typeof window !== 'undefined') {
        // This code will only run in the browser
        localStorage.clear();
    }

    // console.log('Interface Team:');
    interface Team {
        teamName: string;
        isAdmin: boolean;
    }
    // console.log('Interface Member: ');
    interface Member {
        email: string;
        accountCreated: boolean;
        loggedIn: boolean;
        password: string;
        userName: string;
        teams: Team[];
    }
    let members: Member[] = [];

    const member1: Member = {
        email: 'a@a.com',
        accountCreated: true,
        loggedIn: false,
        password: 'aaa',
        userName: 'Anna',
        teams: [
            { teamName: 'Team A', isAdmin: true },
            { teamName: 'Team B', isAdmin: false }
        ]
    };

    const member2: Member = {
        email: 'b@b.com',
        accountCreated: true,
        loggedIn: false,
        password: 'bbb',
        userName: 'Betti',
        teams: [
            { teamName: 'Team A', isAdmin: false },
            { teamName: 'Team B', isAdmin: true }
        ]
    };
    const member3: Member = {
        email: 'c@c.com',
        accountCreated: true,
        loggedIn: false,
        password: 'ccc',
        userName: 'Conni',
        teams: [
            { teamName: 'Team A', isAdmin: false },
            { teamName: 'Team B', isAdmin: false },
            { teamName: 'Team C', isAdmin: true },
            { teamName: 'Team D', isAdmin: true }
        ]
    };

    const member4: Member = {
        email: 'd@d.com',
        accountCreated: false,
        loggedIn: false,
        password: '',
        userName: '',
        teams: [
            { teamName: 'Team C', isAdmin: false },
            { teamName: 'Team D', isAdmin: false }
        ]
    };
    members.push(member1, member2, member3, member4);
    // console.log('Members: ', members);

    members.forEach((member) => {
        // console.log('Schleife localStorage!');
        if (typeof window !== 'undefined') {
            localStorage.setItem(member.email, JSON.stringify(member));
        }
    }); //andersrum: JSON.parse()

//Testausgabe: 
    // if (typeof window !== "undefined") {
    //     for (let i = 0; i < localStorage.length; i++) {
    //         const key = localStorage.key(i);
    //         if (key) {  // Check if key is not null
    //             const item = localStorage.getItem(key);
    //             if (item) {  // Check if item is not null
    //                 const user: Member = JSON.parse(item);
    //                 // console.log("User aus ls: ", user);
    //             }
    //         }
    //     }
    // }
}
