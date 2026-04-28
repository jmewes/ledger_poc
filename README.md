# ledger

A desktop application for managing personal finances, built with JavaFX.

## Build

### Compile into a fat jar

The following command compiles the project and packages `ledger_app` together
with all its dependencies (including JavaFX) into a single executable jar:

```bash
mvn clean package -pl ledger_app -am
```

The fat jar is created at `ledger_app/target/ledger_app-1.0-SNAPSHOT-shaded.jar`.

### Run the fat jar

```bash
java -jar ledger_app/target/ledger_app-1.0-SNAPSHOT-shaded.jar
```

## References

- https://github.com/experimental-software/transcription-audio-player
- https://github.com/bsommerfeld/neverlose
