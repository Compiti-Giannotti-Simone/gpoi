# progettoOrario
Progetto di prova per comandi git - commit - branch - merge

# GIT UNDO - Domande

1. Sono stati effettuati 4 commit dal developer Giuseppe
2. Il branch corrente si chiama main
3. Sono stati modificati i file index.html (aggiunta la colonna alla tabella) e styles.css (modificato il valore width in .contenitore)
4. I commit annullati sono ancora in cronologia, ma sovrascritti da un commit nuovo che ne annulla le modifiche

## GIT RESET
Il comando si usa per forzatamente cancellare uno o più commit dalla history, effettivamente annullandoli come se non fossero mai accaduti.

## GIT REVERT
Il comando si usa per annullare le modifiche di uno o più commit, ma senza eliminarli dalla history. Il modo in cui vengono annullati è sovrascrivendo i file con lo stato precedente e committando i file vecchi
