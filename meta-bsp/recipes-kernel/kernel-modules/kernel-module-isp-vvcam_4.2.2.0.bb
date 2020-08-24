# Copyright 2020 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/vvcam/LICENSE;md5=19597abeeaf4f877fadedbd2b323ab55"

SRCBRANCH = "imx_5.4.47_2.2.0"
ISP_KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/isp-vvcam.git;protocol=https"

SRC_URI = " \
    ${ISP_KERNEL_SRC};branch=${SRCBRANCH} \
"
SRCREV = "b0003957cf7d4af6bc4097414a5a7fbe617f97fe"

S = "${WORKDIR}/git/vvcam/v4l2"

inherit module
