FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-refactoring-to-hello_yocto.patch \
            file://0002-adding-newline-on-the-beginning.patch \
            file://0003-small-refactoring.patch \
            file://0004-adding-foo_bar-feature.patch \
            file://0001-extended-foo_bar.patch \
            file://0002-extended-foo_bar-part-2.patch \
            "

