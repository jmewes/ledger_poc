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

### Compile native binaries

The project uses the [JavaPackager](https://github.com/fvarrui/JavaPackager) Maven plugin to package
the application as a native executable bundled with a full JRE.

Build the **Windows executable** (`ledger.exe`) on a Windows machine:

```bash
mvn package -Ppackage-windows -pl ledger_app -am
```

The executable is created at `ledger_app/target/ledger/ledger.exe`.

Build the **macOS application bundle** (`ledger.app`) on a macOS machine:

```bash
mvn package -Ppackage-mac -pl ledger_app -am
```

The application bundle is created at `ledger_app/target/ledger/ledger.app`.

The macOS build runs without the app sandbox, giving the app full access to the file system by
default. Explicit entitlements for full network access (inbound and outbound) are declared in
`ledger_app/assets/mac/entitlements.plist`, along with the JVM-specific entitlements required
for the hardened runtime.

## References

- https://github.com/experimental-software/transcription-audio-player
- https://github.com/bsommerfeld/neverlose
