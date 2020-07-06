require recipes-kernel/kernel-modules/kernel-module-imx-gpu-viv_6.2.4.p4.0.bb

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

KERNEL_BRANCH ?= "lf-5.4.y"
SRCBRANCH = "${KERNEL_BRANCH}"
LOCALVERSION = "-lts-${KERNEL_BRANCH}"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"

SRCREV = "40d9d56a94652b82e0c1b6b7b4ffaebd5f7cb46f"
