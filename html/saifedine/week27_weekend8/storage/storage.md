In JavaScript gibt es zwei Arten von Web Storage: Local Storage und Session Storage. Beide bieten eine Möglichkeit, Daten im Browser des Benutzers zu speichern, die auch nach dem Neuladen der Seite oder dem Schließen und Wiederöffnen des Browsers erhalten bleiben. Der Unterschied zwischen ihnen liegt hauptsächlich in ihrer Lebensdauer und in dem, wie die gespeicherten Daten verwaltet werden.

    Local Storage:
        Die Daten im Local Storage bleiben auch nach dem Schließen des Browsers erhalten und werden in der Regel nicht automatisch gelöscht, es sei denn, der Benutzer löscht sie manuell oder der Website-Code löscht sie explizit.
        Die gespeicherten Daten sind für alle Tabs und Fenster der gleichen Domain zugänglich.
        Local Storage bietet mehr Speicherplatz als Session Storage (normalerweise mindestens 5 MB pro Domäne).
        Die Daten im Local Storage bleiben solange erhalten, bis sie explizit gelöscht werden oder der Benutzer die Browserdaten löscht.

    Session Storage:
        Die Daten im Session Storage bleiben nur so lange erhalten, wie die Browsersitzung aktiv ist. Wenn der Benutzer den Browser schließt oder das Tab schließt, in dem die Seite geöffnet ist, werden die Daten gelöscht.
        Die gespeicherten Daten sind nur für das aktuelle Tab oder Fenster der gleichen Domain zugänglich. Sie sind nicht zwischen verschiedenen Tabs oder Fenstern geteilt.
        Session Storage bietet in der Regel weniger Speicherplatz als Local Storage (normalerweise mindestens 5 MB pro Domäne).
        Im Gegensatz zu Local Storage werden die Daten im Session Storage automatisch gelöscht, wenn die Browsersitzung endet, was bedeutet, dass sie nicht manuell gelöscht werden müssen.