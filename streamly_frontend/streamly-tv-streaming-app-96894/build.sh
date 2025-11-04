#!/bin/bash
# PUBLIC_INTERFACE
# Root-level build helper to delegate to the Android project under streamly_frontend/.
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$ROOT_DIR/streamly_frontend"

# Pass through flags like --clean
./build.sh "${1:-}"
