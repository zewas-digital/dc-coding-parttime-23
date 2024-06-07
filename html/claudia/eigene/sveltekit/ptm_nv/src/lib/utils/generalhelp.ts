
function looseFirstDigit(id: string): number {
    const shortenedString = id.substring(1);
    return parseInt(shortenedString);
}




//idKey: lastUserID, lastTeamID,  ...
//let userID start with identifier 1, teamID start with identifier 2
/**
 * 
 * @param idKey string lastUserID, lastTeamID 
 * @param identifier string "1" User, "2" Team
 * @returns string new ID
 */
function getNextIDString(idKey: string, identifier: string): string {
    let idString = "";
    if (typeof window !== "undefined") { //local storage nicht auf Server!
        const lastUsedID = localStorage.getItem(idKey); //Key and Value are Strings!

        if (!lastUsedID) { //no value exists for this key
            idString =  identifier + "1"; //then next user or team is the first one to be created
        }
        else { //then ID has at least 2 digits
            const shortenedID = looseFirstDigit(lastUsedID);
            const newID = shortenedID + 1;
            idString = identifier + newID.toString();
        }
        return getNextID(idString);
    }
    return "0";

}

export function getNextID(idString: string) : number {
    return parseInt(idString);
}