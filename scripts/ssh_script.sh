#!/bin/bash

sshjorge () {
ssh -T jorge@visa.cs.fiu.edu <<- EOF

ls
echo ""
cd seniorproject
ls

EOF
}

runlocalwatts ()
{
echo "sudo ./wattsup ttyUSB0 -t watts"
}
