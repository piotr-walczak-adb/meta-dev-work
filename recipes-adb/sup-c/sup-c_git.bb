SUMMARY = "Test recipe"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/piotr-walczak-adb/sup-c.git \
           "
S = "${WORKDIR}/git/"

do_compile() {
    ${CC} ${S}/sup-c.c -o sup-c
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 sup-c ${D}${bindir}
}

