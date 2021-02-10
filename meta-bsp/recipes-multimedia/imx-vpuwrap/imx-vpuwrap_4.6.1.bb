# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2020 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Freescale Multimedia VPU wrapper"
DEPENDS = "virtual/imxvpu"
DEPENDS_append_mx8mp = " imx-vpu-hantro-vc"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=231e11849a4331fcbb19d7f4aab4a659"

IMX_VPUWRAP_SRC ?= "git://github.com/NXP/imx-vpuwrap.git;protocol=https"
SRCBRANCH = "master"
SRC_URI = "${IMX_VPUWRAP_SRC};branch=${SRCBRANCH}"
SRCREV = "9d05c1d659efc9239da70bfd648470c7b6c60fed"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

do_install_append() {
    # FIXME: Drop examples for now
    rm -r ${D}${datadir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

# Compatible only for i.MX with VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpu = "${MACHINE}"