require linux.inc

DESCRIPTION = "Linux kernel for F1C100S processors"

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

COMPATIBLE_SOC = "f1c100s"
#COMPATIBLE_MACHINE = "(licheepi-nano)"
RDEPENDS_${PN} += "licheepi-board"

PV = "4.14"
PR = "r1"
SRCREV_pn-${PN} = "7115045f390bc4d80d986fe4b63925fa49fd3488"

MACHINE_KERNEL_PR_append = "a"
KBRANCH = "nano-4.14-exp"
SRC_URI = "git://git@10.0.0.88/Mirror/Lichee/linux.git;protocol=ssh;branch=${KBRANCH} \
        file://defconfig \
        "
S = "${WORKDIR}/git"

