param (
    [Parameter(Position = 0, mandatory = $true)]
    [string]$newVersion
)

mvn versions:set -DnewVersion="$newVersion" -DgenerateBackupPoms=false